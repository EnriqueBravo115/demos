import { FC, ReactElement } from "react";

interface ExampleProps {
  name: string;
}

const Example: FC<ExampleProps> = ({ name }): ReactElement => {
  return (
    <>
      <h1 className="bg-pink-50 ">Hello {name}</h1>
    </>
  );
};

export default Example;
