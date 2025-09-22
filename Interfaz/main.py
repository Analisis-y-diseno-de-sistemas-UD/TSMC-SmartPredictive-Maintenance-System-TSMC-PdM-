import tkinter as tk
from tkinter import messagebox

# Función para manejar el evento de registro
def handle_signup():
    username = entry_username.get()
    password = entry_password.get()

    if username and password:
        # Aquí iría la lógica para guardar el usuario,
        # como en una base de datos o un archivo.
        # Por ahora, solo mostraremos un mensaje.
        messagebox.showinfo("Éxito", f"¡Usuario {username} registrado con éxito!")
        # Limpiar los campos después del registro
        entry_username.delete(0, tk.END)
        entry_password.delete(0, tk.END)
    else:
        messagebox.showerror("Error", "Por favor, completa todos los campos.")

# Configurar la ventana principal
window = tk.Tk()
window.title("Registro de Usuario")
window.geometry("300x200")
window.configure(bg="#f0f0f0")

# --- Widgets ---

# Frame para agrupar los widgets y centrar
frame = tk.Frame(window, bg="#f0f0f0")
frame.pack(pady=20, padx=20)

# Etiqueta y campo de entrada para el nombre de usuario
label_username = tk.Label(frame, text="Nombre de usuario:", bg="#f0f0f0")
label_username.pack(pady=5)
entry_username = tk.Entry(frame, width=30)
entry_username.pack(pady=5)

# Etiqueta y campo de entrada para la contraseña
label_password = tk.Label(frame, text="Contraseña:", bg="#f0f0f0")
label_password.pack(pady=5)
entry_password = tk.Entry(frame, width=30, show="*") # El 'show' oculta los caracteres
entry_password.pack(pady=5)

# Botón de registro
signup_button = tk.Button(frame, text="Registrarse", command=handle_signup, bg="#4CAF50", fg="white")
signup_button.pack(pady=10)

# Iniciar el bucle principal de la aplicación
window.mainloop()