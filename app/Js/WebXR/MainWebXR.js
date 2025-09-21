const xrCam=new WebXRCamera("Camera1",scene,xrSessionManager);
const direction=xrCam.getDirection(Axis.Z)+"Camera Direction in Front";
const directionX=xrCam.getDirection(Axis.X)+"Camera Direction On Right";
const Height=xrCam.realWorldHeight;