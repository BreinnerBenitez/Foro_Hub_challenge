# 🚀 Proyecto API 

**Creado por:**  Breinner Benitez

![Captura de pantalla de mostrarDatos.jsp](img/Badge-Spring.png) 

## 🛠 Tecnologías Utilizadas

- **Lenguaje**: Java 17 ☕
- **Framework**: Spring Boot 3.0 🌱
- **Base de Datos**: MySQL 8.0 🐬
- **Seguridad**: JSON Web Tokens (JWT) 🔐
- **Herramientas de Construcción**: Maven 4.0.0 📦

## 🛠️ Dependencias del Proyecto


- **🌐 Spring Web** - Framework para desarrollar aplicaciones web y APIs RESTful.  
- **⚡ Spring Boot DevTools** - Proporciona herramientas para desarrollo rápido, como recarga automática.  
- **📂 Spring Data JPA** - Acceso simplificado a bases de datos relacionales utilizando JPA.  
- **🛫 Flyway Migration** - Herramienta para migraciones de base de datos y versionado.  
- **🐬 MySQL Driver** - Conector para interactuar con bases de datos MySQL.  
- **✔️ Validation** - Manejo de validaciones para entradas y datos de usuario.  
- **🛡️ Spring Security** - Framework para autenticar, autorizar y proteger aplicaciones.

 ## Descripcion:

El proyecto ForoHub es una API REST desarrollada como parte de un proyecto final grupal. Su propósito es simular un foro de ayuda, permitiendo la interacción entre usuarios mediante la creación, visualización, actualización y eliminación de tópicos. La aplicación también implementa seguridad mediante Spring Security y JWT, garantizando la autenticación y autorización de los usuarios.

El modelo de datos incluye dos entidades principales: Usuarios y Tópicos, con relaciones adecuadas para gestionar las funcionalidades del foro. El desarrollo sigue principios de buenas prácticas como la validación de datos, migraciones de base de datos con Flyway, y un diseño modular utilizando Spring Boot.



## 🌟 Funcionalidades del API REST
### 🧑‍💻 Usuario/Autenticación y Autorización:-
- **Inicio de sesión:** - Genera un token JWT para autenticar al usuario y permitirle acceder a los recursos protegidos del sistema.
- **Roles y permisos:** - Define roles (e.g. usuario) y restringe el acceso a ciertas funcionalidades.
- **Gestión de autenticación:** - Valida tokens JWT en cada solicitud protegida. Administra la renovacion y expiracion tokens.


### 📚 Tópicos
- **Crear un nuevo tópico:** - Permite a los usuarios crear un nuevo tópico con un título y contenido.
- **Obtener lista de tópicos:** - Devuelve todos los tópicos publicados, con opciones de paginación.
- **Obtener detalles de un tópico:** - Retorna los detalles completos de un tópico especifico, incluyendo autor, curso y fecha de creación.
- **Actualizar un tópico:** - Permite editar el contenido de un tópico existente.
- **Eliminar un tópico:** - Borra un topico especifico de la base de datos.




