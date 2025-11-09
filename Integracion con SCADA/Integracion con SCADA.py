from opcua import Client

class SCADAConnector:
    def __init__(self, server_url):
        self.client = Client(server_url)

    def connect(self):
        self.client.connect()
        print("Connected to SCADA OPC-UA server")

    def disconnect(self):
        self.client.disconnect()
        print("Disconnected from SCADA server")

    def read_variable(self, node_id):
        node = self.client.get_node(node_id)
        value = node.get_value()
        print(f"Read value: {value}")
        return value

    def write_variable(self, node_id, value):
        node = self.client.get_node(node_id)
        node.set_value(value)
        print(f"Written value: {value}")

# Uso en el contexto del proyecto TSMC-PdM:
if __name__ == "__main__":
    server_url = "opc.tcp://localhost:4840"   # Cambia la URL según la config SCADA real
    scada = SCADAConnector(server_url)
    scada.connect()
    # Leer temperatura de sensor
    temp = scada.read_variable("ns=2;s=Sensor.Temp")
    # Escribir setpoint de mantenimiento
    scada.write_variable("ns=2;s=Maintenance.Setpoint", 50)
    scada.disconnect()
