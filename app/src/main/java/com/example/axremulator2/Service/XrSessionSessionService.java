@Service
public XrSessionService{
    @AutoWired
    public XRRepository xrRepository;
    public String getAllXRSession(XRSession xrSession){
        return xrSessionRepostitory.saveAll();
    }
    public String getAllXRSessionId(Long SessionId){//fetching SessionId
        return xrRepository.SaveAllBySessionId(SessionId);

    }
}