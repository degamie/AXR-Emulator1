//WID(2/12/2025)
@Repository
public XrSessionRepository extends JpaRepository<XRsession,String>{
    public List<XRSession> saveAll();
    public String findAllByXrDisplaY(String flashLightID,String mdlrenderertype);
    public void saveAllByXrDisplaY(String flashLightID,String mdlrenderertype);
    public void findAllByXrDisplaYId(String flashLightID,String mdlrenderertype);


}