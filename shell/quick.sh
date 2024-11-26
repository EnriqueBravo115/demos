openssl req -newkey rsa:2048 -x509 -keyout key.pem -out cert.pem

# Crea un nuevo certificate
openssl pkcs12 -export -in cert.pem -inkey key.pem -out certificate
