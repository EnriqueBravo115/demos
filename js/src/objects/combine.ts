export const persona = {
    nombre: 'Juan',
    edad: 30,
};

export const contacto = {
    telefono: '123-456-7890',
    email: 'juan@example.com',
};

export const empleado = {
    ...persona,
    ...contacto,
    cargo: 'Desarrollador',
};

export const redstone_torch = {
    stick: 1,
    redstone_dust: 1,
};

export const redstone_repeater = {};
