# Microservicio de Mascotas

Este microservicio representa la administración de mascotas disponibles para adopción.

## Atributos sugeridos
- `id`
- `nombre`
- `especie`
- `raza`
- `edad`
- `tamaño`
- `sexo`
- `estadoSalud`
- `estadoAdopcion`
- `descripcion`

## Funcionalidades requeridas
1. Registrar una mascota.
2. Consultar todas las mascotas.
3. Buscar mascota por ID.
4. Buscar mascotas por especie.
5. Buscar mascotas por estado de adopción.
6. Actualizar información de una mascota.
7. Cambiar estado de adopción de una mascota.
8. Eliminar una mascota por ID.

## Variables de ambiente usadas por el microservicio
- **PORT default(9091)**: representa el puerto donde se ejecuta el microservicio
- **DB_IP default(localhost)**: representa la IP del servidor MySQL
- **DB_PORT default(3306)**: representa el puerto del servidor MySQL
- **DB_NAME default(microservicepet)**: nombre de la base de datos al que se conectara el microservicio
- **DB_USER default(root)**: usuario de la base de datos
- **DB_PASSWORD default(abc123)**: contraseña de la base de datos
- **EUREKA_IP default(localhost)**: IP del servidor de descubrimiento Eureka
- **EUREKA_PORT default(9999)**: puerto de conexión al servidor de descubrimiento Eureka
- **CONFIG_IP default(localhost)**: IP del servidor de configuracion
- **CONFIG_PORT default(7777)**: puerto del servidor de configuracion