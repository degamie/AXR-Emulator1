@Controller
@RestController
public class XRsessionController{

    @Autowired
    public XRSessionService xrSessionService;
    @GetMapping("/saveAll/{SessionId}")
    public String getAllBySessionId(@RequestParam "SessionId" String SessionId,@RequestBody XRSession xrSession){
        return xrSessionService.getAllBySessionId(SessionId);
    }

}