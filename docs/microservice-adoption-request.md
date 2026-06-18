# Microservicio de Solicitudes de Adopción
Este microservicio representa la administración de solicitudes de adopción dentro del sistema.

La entidad principal será AdoptionRequest, la cual almacena la información necesaria para registrar qué adoptante desea adoptar una mascota.

## Entidad: AdoptionRequest
La entidad AdoptionRequest representa una solicitud realizada por un adoptante para iniciar el proceso de adopción de una mascota.

Este microservicio se comunica con:

- Microservicio de mascotas.
- Microservicio de adoptantes.

## Atributos sugeridos
- id
- adopterId
- petId
- emailAdopter
- namePet
- status

## Enum sugerido: AdoptionRequestStatus
El estado de la solicitud puede manejarse mediante un enum.

```java
public enum AdoptionRequestStatus {
    PENDING,
    APPROVED,
    REJECTED
}
```

## Implementación de Resilience4j
Al comunicarse con los microservicios **microservicepet** y **microserviceadopter** se implementa el patrón de diseño de **Circuit Breaker** en la implementación del servicio (**ServiceImpl**)

### Se agrega el siguiente starter
- Resilience4j de spring cloud

## Variables de ambiente usadas por el microservicio
- **PORT default(9093)**: representa el puerto donde se ejecuta el microservicio
- **DB_IP default(localhost)**: representa la IP del servidor MySQL
- **DB_PORT default(3306)**: representa el puerto del servidor MySQL
- **DB_NAME default(microservicepet)**: nombre de la base de datos al que se conectara el microservicio
- **DB_USER default(root)**: usuario de la base de datos
- **DB_PASSWORD default(abc123)**: contraseña de la base de datos
- **EUREKA_IP default(localhost)**: IP del servidor de descubrimiento Eureka
- **EUREKA_PORT default(9999)**: puerto de conexión al servidor de descubrimiento Eureka
- **CONFIG_IP default(localhost)**: IP del servidor de configuracion
- **CONFIG_PORT default(7777)**: puerto del servidor de configuracion