def verificar_codigo_y_crear_archivo(codigo: str):
    # Verifica si el código es de Python o Java
    es_python = codigo.strip().startswith('def') or 'import' in codigo or 'print(' in codigo
    es_java = codigo.strip().startswith('public class') or 'System.out.println(' in codigo

    # Validar código simple por presencia de características (no compilación real)
    if es_python:
        archivo = 'resultado_python.txt'
        try:
            compile(codigo, '<string>', 'exec')  # Verifica sintaxis
            con_validacion = 'El código Python es viable.'
        except Exception as e:
            con_validacion = f'Código Python inválido: {str(e)}'
    elif es_java:
        archivo = 'resultado_java.txt'
        # No se puede compilar Java, solo validación básica
        if 'public static void main' in codigo:
            con_validacion = 'El código Java parece viable (validación básica).'
        else:
            con_validacion = 'Código Java inválido (falta método main).'
    else:
        archivo = 'resultado_desconocido.txt'
        con_validacion = 'El código no parece ser ni Python ni Java.'

    # Crear el archivo con el resultado
    with open(archivo, 'w', encoding='utf-8') as f:
        f.write(con_validacion)

    return archivo, con_validacion

# Ejemplo de uso:
# codigo_ejemplo = """def hola():\n    print('Hola mundo')\n"""
# nombre_archivo, mensaje = verificar_codigo_y_crear_archivo(codigo_ejemplo)
# print(mensaje)
