#3. Elaborar un programa en Java que lea los datos de un estudiante (nombre y tres calificaciones parciales) e imprima el nombre y la calificación
# final de acuerdo con lo siguiente: para aprobar el curso debe tener 60 o más en cada una de las tres calificaciones, la calificación final será el
# promedio. En caso de haber reprobado uno o más exámenes ordinarios, la calificación final será NA (No Acreditado).
nombre = input("Introduzca nombre del estudiante: ")
parcial1 = float(input("Calificacion del primer parcial: "))
parcial2 = float(input("Calificacion del segundo parcial: "))
parcial3 = float(input("Calificacion del tercer parcial: "))
sumaparciales = parcial1 + parcial2 + parcial3
promedio = sumaparciales / 3
#Opcion 1 (else)
'''
if parcial1 >= 60 and parcial2 >= 60 and parcial3 >= 60:
    print("Nombre del alumno: " + nombre)
    print(f"Promedio final: {promedio:,.2f}")
    print("Aprobatorio: Si")
else:
    print("Nombre del alumno: " + nombre)
    print(f"Promedio final del alumno: {promedio:,.2f}")
    print("Aprobatorio: No")
'''
#Opcion 2 (elif)
'''
if parcial1 >= 60 and parcial2 >= 60 and parcial3 >= 60:
    print("Nombre del alumno: " + nombre)
    print(f"Promedio final del alumno: {promedio:,.2f}")
    print("Aprobatorio: Si")
elif parcial1 < 60 or parcial2 < 60 and parcial3 < 60:
    print("Nombre del alumno: " + nombre)
    print(f"Promedio final del alumno: {promedio:,.2f}")
    print("Aprobatorio: No")
'''