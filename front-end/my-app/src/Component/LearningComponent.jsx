import FirstComponent from "./FirstComponent";
import SecondComponent from "./SeconodComponent";
import ThirdComponent from "./ThirdComponent";
import FouthComponent from "./FouthComponent";
import { FifthComponent } from "./FirstComponent"; // 특정 컴포넌트를 import 하고 싶다면 중괄호를 사용

export default function LearningComponent(){
  return(
    <div>
      <FirstComponent />
      <SecondComponent />
      <ThirdComponent />
      <FouthComponent />
      <FifthComponent />
    </div>
  )
}

