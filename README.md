# 📱 Mi Primera App Android - 5 Actividades

¡Bienvenido a mi proyecto! Esta es una aplicación nativa de Android desarrollada en **Kotlin** que demuestra el flujo de navegación entre múltiples pantallas (Activities) y el paso de datos entre ellas.

## 🚀 Funcionalidades
La aplicación consta de 5 pantallas conectadas de forma lógica:

1.  **Pantalla de Login:** Validación simulada de usuario. Recibe el nombre del usuario para personalizar la experiencia.
2.  **Pantalla de Inicio:** El "hub" principal. Muestra un mensaje de bienvenida con el nombre recibido y botones para navegar al resto de secciones. También recibe y muestra datos devueltos desde la pantalla de Contacto.
3.  **Pantalla de Contacto:** Contiene un formulario donde el usuario puede escribir un mensaje. Al enviarlo, el texto se devuelve a la pantalla de Inicio mediante un `Intent`.
4.  **Pantalla Sobre Nosotros:** Información sobre el propósito de la app.
5.  **Pantalla de Localización:** Simulación de ubicación o mapa de la aplicación.

## 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Kotlin 
* **IDE:** Android Studio (Ladybug / Jellyfish)
* **Interfaz:** XML Layouts con `ViewBinding` para una gestión de vistas más eficiente y segura.
* **Navegación:** Explicit Intents para comunicación entre Activities.
* **Build System:** Gradle (Kotlin DSL).

## 📸 Capturas de Pantalla
> *Instrucciones: Puedes añadir aquí capturas de tu móvil para que el repositorio se vea genial.*

| Login | Inicio | Contacto |
| :---: | :----: | :------: |
| ![Login](https://via.placeholder.com/150) | ![Inicio](https://via.placeholder.com/150) | ![Contacto](https://via.placeholder.com/150) |

## 🏗️ Instalación y Uso
1. Clona este repositorio:
   ```bash
   git clone [https://github.com/TU_USUARIO/TU_REPOSITORIO.git](https://github.com/TU_USUARIO/TU_REPOSITORIO.git)
