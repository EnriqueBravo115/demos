# Muestra las lineas que contengan root en el file /etc/passwd
grep root /etc/passwd

# Operador logico AND
grep abc *sh | grep def

# Operador logico OR
grep "abc\|def" *sh

# Lineas que contengan 2 caracteres
grep '^..$' example.txt

# Lineas que contengan exactamente 2 puntos. \ representa. literal
grep '^\.\.$' example.txt

# Busca dos palabras en la misma linea
grep -on "non.*Quod" grep/sample3.txt
