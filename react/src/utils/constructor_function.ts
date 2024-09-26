interface Persona {
    nombre: string;
    edad: number;
}

interface Empleado extends Persona {
    cargo: string;
}

interface PersonaConstructor {
    new(nombre: string, edad: number): Persona;
}

interface EmpleadoConstructor extends PersonaConstructor {
    new(nombre: string, edad: number, cargo: string): Empleado;
}

export function Persona(this: Persona, nombre: string, edad: number) {
    this.nombre = nombre;
    this.edad = edad;
}

export function Empleado(this: Empleado, nombre: string, edad: number, cargo: string) {
    Persona.call(this, nombre, edad);
    this.cargo = cargo;
}
