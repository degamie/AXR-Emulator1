const xrCam=new WebXRCamera("Camera1",scene,xrSessionManager);
const direction=xrCam.getDirection(Axis.Z)+"Camera Direction in Front";