const xrCam=new WebXRCamera("Camera1",scene,xrSessionManager);
const directionY=xrCam.getDirection(Axis.Y)+"Camera Direction On Left";//Impl(26/09/2025)
const directionZ=xrCam.getDirection(Axis.Z)+"Camera Direction in Front";
const directionY=xrCam.getDirection(Axis.X)+"Camera Direction On Right";//
const direction_opp_Z=xrCam.getDirection(-(Axis.Z))+"Camera Direction On Back";
const Height=xrCam.realWorldHeight;
xrCam.setTransformationFromNonVRCamera(xrCam,true);
const Width=xrCam.realWorldWidth;

const Light=new BABYLON.PointLight("pointLight",new BABYLON.Vector3(1,10,5),scene);//impl(28/09/2025)
const shape=new BABYLON.Cylinder(
new BABYLON.Vector3(0,-.9,0),
new BABYLON.Vector3(0,+.9,0),
1,scene
);
const mesh.actionManager=new BABYLON.ActionManager(scene);
const raycastOutput=new BABYLON.PhysicsRayCastResult();
const headNode=new BABYLON.TransformNode("headNode");