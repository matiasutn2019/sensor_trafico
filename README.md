SENSOR DE VELOCIDAD

Se requiere que, en virtud de un sensor de velocidad que brinda datos
de los vehículos que transitan por determinada autovía, 
se labren actas de tránsito llamadas "tickets" cada vez que un vehículo
supere los límites de velocidad establecidos en la siguiente tabla.

En condiciones climáticas normales los límites establecidos son:

Autos: 130
Moto: 130
Camión: 90
Tractor: 60

En condiciones climáticas de lluvia moderada los límites establecidos son:

Autos: 110
Moto: 110
Camión: 80
Tractor: 60

En condiciones climáticas de lluvia torrencial los límites establecidos son:

Autos: 90
Moto: 90
Camión: 70
Tractor: 60

Con respecto a las actas llamadas "tickets", deben guardarse en formato JSON y en MySQL.

El ticket debe tener IDTicket, FechaYhora, DatosDelVehiculo, SituacionClimatologica, LimiteVelocidadPermitido, limiteMedido.

Se debe loggear toda la actividad de tránsito.
"# sensor_trafico" 
