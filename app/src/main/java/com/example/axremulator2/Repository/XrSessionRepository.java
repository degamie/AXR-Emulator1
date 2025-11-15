@Repository
public XrSessionRepository extends JpaRepository<XRsession,String>{
    public List<XRSession> saveAll();
    public String SaveAllBySessionId(Long SessionId);


}