@Repository
public XrSessionRepository extends JpaRepository<XRsession,String>{
    public List<XRSession> saveAll();
    public String findAllByXrDisplaY(String flashLightID,String mdlrenderertype);   

}