# --rm: Se eliminara el container al detenerse
docker container run --rm ubuntu:latest

# --ti: Se asiguna una tty y se habilita un modo interactivo, forma abreviada 
# de --tty y --interactive
docker container run --ti ubuntu:latest

# Por defecto se usa etc/resolv.conf, hace override y se pueden especificar multiples
docker container run --dns=8.8.8.8 ubuntu:latest

# Especifica dominios de busqueda dns, desactivar con --dns-serch.
docker container run --dns-search=example1.com ubuntu:latest

# Si no se especifica se crea uno con el prefijo: 02:42:ac:11
docker container run --mac-address="a2:11:aa:22:bb:33" ubuntu:latest

# crea volume
docker container run --mount type=bind,source=/ruta/local,target=/ruta/contenedor,readonly ubuntu:latest

# Combina todas las opciones en un campo
docker container run -v /ruta/local:/ruta/contenedor ubuntu:latest
