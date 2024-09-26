interface Persona {
  nombre: string;
  edad: number;
}

interface Empleado extends Persona {
  cargo: string;
}

export function Persona(this: Persona, nombre: string, edad: number) {
  this.nombre = nombre;
  this.edad = edad;
}

export function Empleado(
  this: Empleado,
  nombre: string,
  edad: number,
  cargo: string,
) {
  Persona.call(this, nombre, edad);
  this.cargo = cargo;
}

export const object_empleado = new (Empleado as any)(
  "Juan",
  30,
  "Desarrollador",
);
