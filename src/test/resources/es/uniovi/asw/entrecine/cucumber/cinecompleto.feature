# language: es
Característica: ReservaLlena

  Escenario: No hay entradas disponibles
   
    Dado un cine completo con 100 butacas
    Cuando yo compro una entrada y aforo esta lleno
    Entonces la disponibilidad debe ser false
    