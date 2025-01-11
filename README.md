# 🌐 Foro Hub API

## 🔍 Descripción

**Foro Hub API** es un proyecto backend desarrollado en Java utilizando Spring Boot, que replica las funcionalidades esenciales de un foro. Este proyecto permite gestionar tópicos con operaciones CRUD (Crear, Leer, Actualizar, Eliminar) y está diseñado siguiendo las mejores prácticas de arquitectura REST.

## 💡 Características principales

- ✨ **Operaciones CRUD** para la gestión de tópicos.
- 🔒 **Validaciones** basadas en reglas de negocio utilizando Bean Validation.
- 🔐 **Autenticación y autorización** mediante JWT.
- ⚖️ **Paginación y ordenamiento** para listados de tópicos.
- 📊 **Persistencia** de datos con base de datos relacional.

## 🛠️ Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3.4**
- **Spring Security**
- **JPA (Hibernate)**
- **MySQL**
- **JWT (Json Web Tokens)**

## 🔹 Requisitos previos

Antes de ejecutar este proyecto, asegúrate de tener instalado:

- **Java 17** o superior.
- **Maven** para la gestión de dependencias.
- **MySQL** configurado y en ejecución.

## 🔧 Configuración inicial

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/foro-hub-api.git
   ```
2. Accede al directorio del proyecto:
   ```bash
   cd foro-hub-api
   ```
3. Configura la base de datos MySQL en el archivo `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/foro_hub
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   spring.jpa.hibernate.ddl-auto=update
   ```
4. Compila y construye el proyecto con Maven:
   ```bash
   mvn clean install
   ```
5. Ejecuta la aplicación:
   ```bash
   mvn spring-boot:run
   ```

## 🔗 Endpoints principales

### **Tópicos**

- **GET** `/topicos` - Listar todos los tópicos con paginación y ordenamiento.
- **GET** `/topicos/{id}` - Obtener los detalles de un tópico por ID.
- **POST** `/topicos` - Crear un nuevo tópico.
- **PUT** `/topicos/{id}` - Actualizar un tópico existente.
- **DELETE** `/topicos/{id}` - Eliminar un tópico.

### **🔑 Autenticación**

- **POST** `/login` - Generar un token JWT para autenticar al usuario.

## 🌐 Estructura del proyecto

El proyecto sigue una arquitectura basada en capas:

```
📂 src/main/java
├── 📁 aluracursos.apirest_foroAlura
│   ├── 📂 configuration
│   │   └── 🔧 CorsConfiguration
│   ├── 📂 controllers
│   │   ├── 🔹 AutenticacionController
│   │   └── 🔹 TopicoControllers
│   ├── 📂 domain
│   │   ├── 📂 topico
│   │   │   ├── 📝 Cursos
│   │   │   ├── 📝 DatosActualizarTopico
│   │   │   ├── 📝 DatosListadoTopico
│   │   │   ├── 📝 DatosRegistroTopico
│   │   │   ├── 📝 DatosRespuestaTopico
│   │   │   ├── 📝 Topico
│   │   │   └── 🗃️ TopicoRepository
│   │   └── 📂 usuario
│   │       ├── 📝 DatosAutenticacionUsuario
│   │       ├── 📝 Usuario
│   │       └── 🗃️ UsuarioRepository
│   ├── 📂 infra
│   │   ├── ⚠️ TratadorDeErrores
│   │   └── 🔐 security
│   │       ├── 🔑 AutenticacionService
│   │       ├── 🔑 DatosJWTToken
│   │       ├── 🔑 SecurityConfigurations
│   │       ├── 🔑 SecurityFilter
│   │       └── 🔑 TokenService
│   └── 🚀 ApirestForoAluraApplication
📂 resources
├── 📂 db.migration
│   ├── 📄 V1_create-table-topicos.sql
│   └── 📄 V2_create-table-usuarios.sql
```

## 📂 Base de datos

La aplicación utiliza **MySQL** como base de datos relacional. Antes de ejecutar el proyecto, asegúrate de crear una base de datos llamada `foro_hub`:

```sql
CREATE DATABASE foro_hub;
```

Configura las credenciales en el archivo `application.properties` como se mencionó anteriormente.

## 🔒 Autenticación y autorización

El sistema utiliza **JWT** para la autenticación. Para obtener un token:

1. Envía una solicitud **POST** al endpoint `/login` con las credenciales del usuario:
   ```json
   {
       "email": "usuario@ejemplo.com",
       "clave": "123456"
   }
   ```
2. Usa el token devuelto para autenticar solicitudes, añadiéndolo en el encabezado `Authorization`:
   ```
   Authorization: Bearer <token>
   ```

## 🔧 Ejecución de pruebas

Este proyecto incluye pruebas unitarias y de integración:

```bash
mvn test
```

## 🛠️ Contribuciones

Si deseas contribuir a este proyecto:

1. Haz un fork del repositorio.
2. Crea una rama para tu función o corrección:
   ```bash
   git checkout -b nombre-de-tu-rama
   ```
3. Envía tus cambios mediante un pull request.

## 🔒 Licencia

Este proyecto está licenciado bajo la [MIT License](LICENSE).

---

¡Gracias por tu interés en **Foro Hub API**! Si tienes alguna duda o sugerencia, no dudes en contactarme.

