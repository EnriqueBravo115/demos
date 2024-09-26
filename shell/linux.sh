# atributos de un dispositivo
udevadm info --query=all --name=/dev/sda

# visualizar partitions del sistema
sudo parted -l

# montar
sudo mount /dev/sda1 /mnt/disk
