//WID(30/11/2025)
@Repository
public XrSessionRepository extends JpaRepository<XRsession,String>{
    public List<XRSession> saveAll();
    public String findAllByXrDisplaY(String flashLightID,String mdlrenderertype);
    public void saveAllByXrDisplaY(String flashLightID,String mdlrenderertype);


}