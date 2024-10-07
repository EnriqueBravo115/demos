import { describe, expect, test } from "bun:test";
import { object_empleado, Persona } from "../../src/constructor_function";
import { empleado, persona } from "../../src/objects/combine";

describe("Objects", () => {
  test("Simple Prototyping", () => {
    const proto = {
      sender: "luis@gmail.com",
    };

    const child = Object.create(proto);
    const child2 = Object.setPrototypeOf({}, proto);

    expect(Object.getPrototypeOf(child) === proto).toBeTrue();
    expect(Object.getPrototypeOf(child2) === proto).toBeTrue();
  });

  test("Constructor Functions", () => {
    expect(object_empleado.__proto__ === Persona.prototype);
  });

  test("Combine Objects", () => {
    expect(empleado.edad === persona.edad);
  });
});
