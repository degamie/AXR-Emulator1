const xrCam=new WebXRCamera("Camera1",scene,xrSessionManager);
const directionY=xrCam.getDirection(Axis.Y)+"Camera Direction On Left";//Impl(26/09/2025)
const direction=xrCam.getDirection(Axis.Z)+"Camera Direction in Front";
const directionX=xrCam.getDirection(Axis.X)+"Camera Direction On Right";
const directionZ=xrCam.getDirection(Axis.Z)+"Camera Direction On Top";
const Height=xrCam.realWorldHeight;
xrCam.setTransformationFromNonVRCamera(xrCam,true);
const Width=xrCam.realWorldWidth;
