Integración SCADA con Python
Este módulo permite la integración entre el sistema TSMC-SmartPredictive-Maintenance-System-TSMC-PdM- y un servidor SCADA a través de OPC-UA usando Python.

Requisitos
Python 3.7+

Biblioteca opcua (pip install opcua)

Acceso al servidor SCADA (OPC-UA) y nodos configurados

Uso
Clona el repositorio y navega a la carpeta del proyecto.

Instala las dependencias:

text
pip install opcua
Adapta los parámetros en el archivo de integración:

Cambia server_url por la dirección de tu SCADA OPC-UA.

Modifica los NODE IDs para ajustar los sensores/controladores usados.

