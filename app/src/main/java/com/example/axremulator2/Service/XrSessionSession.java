import com.jetbrains.exported.JBRApi;

@Service
public XrSessionService{
    @AutoWired
    public XRRepository xrRepository;
    public String getAllXRSession(XRSession xrSession){
        return xrSessionRepostitory.saveAll();
    }
}