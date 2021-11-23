package com.bluescript.demo;

import java.util.List;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;import.com.bluescript.demo.repository.KsdscustRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;import io.swagger.annotations.ApiResponses;;
import com.bluescript.demo.model.ErrorMsg;
import com.bluescript.demo.model.EmVariable;
import com.bluescript.demo.model.Dfhcommarea;
import com.bluescript.demo.model.CaCustomerRequest;
import com.bluescript.demo.model.CaCustsecrRequest;
import com.bluescript.demo.model.CaPolicyRequest;
import com.bluescript.demo.model.CaPolicyCommon;
import com.bluescript.demo.model.CaEndowment;
import com.bluescript.demo.model.CaHouse;
import com.bluescript.demo.model.CaMotor;
import com.bluescript.demo.model.CaCommercial;
import com.bluescript.demo.model.CaClaim;

@Getter
@Setter
@RequiredArgsConstructor
@Log4j2
@Component

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@ApiResponses(value = {
        io.swagger.annotations.ApiResponse(code = 400,
                message = "This is a bad request, please follow the API documentation for the proper request format"),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Due to security constraints, your access request cannot be authorized"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "The server/Application is down. Please contact support team.") })

public class Lgucvs01 {

    @Autowired
    private ErrorMsg errorMsg;
    @Autowired
    private EmVariable emVariable;
    @Autowired
    private Dfhcommarea dfhcommarea;
    @Autowired
    private CaCustomerRequest caCustomerRequest;
    @Autowired
    private CaCustsecrRequest caCustsecrRequest;
    @Autowired
    private CaPolicyRequest caPolicyRequest;
    @Autowired
    private CaPolicyCommon caPolicyCommon;
    @Autowired
    private CaEndowment caEndowment;
    @Autowired
    private CaHouse caHouse;
    @Autowired
    private CaMotor caMotor;
    @Autowired
    private CaCommercial caCommercial;
    @Autowired
    private CaClaim caClaim;
    @Autowired
    private KsdscustRepository ksdscust;
    @Autowired
    private KsdscustRepository ksdscust;
    private int wsResp;
    private int wsResp2;
    private int wsCommareaLen;
    private int wsCommareaLenf;
    private String wsTime;
    private String wsDate;
    private String caData;

   @PostMapping("/lgucvs01") 
  public void mainline(){
 log.debug("Methodmainlinestarted..");
 try{
 wsCustomerArea =  ksdscust.findById(caCustomerNum).orElseThrow().getWsCustomerArea();
}catch(Exception e){log.error("No Record Found" );wsResp = 1; }
 if (wsCustomerArea != null) { 
if(wsResp == dfhresp (NORMAL) )
 { 
 dfhcommarea.setCaReturnCode("81");writeErrorMessage();
 log.error("Error code :", LGV1); 
 throw new LGV1Exception("LGV1"); 
 /* return */ 

 } 
 try{
 caCustomerNum =  ksdscust.save().orElseThrow().getCaCustomerNum();
/*update findBy first and then use save previous read is with update */}catch(Exception e){log.error("No Record Found" );wsResp = 1; }
 if (caCustomerNum != null) { 
if(wsResp == dfhresp (NORMAL) )
 { 
 dfhcommarea.setCaReturnCode("82");writeErrorMessage();
 log.error("Error code :", LGV2); 
 throw new LGV2Exception("LGV2"); 
 /* return */ 

 } 

log.debug("Method mainline completed..");
 }

    public void aExit() {
        log.debug("MethodaExitstarted..");

        log.debug("Method aExit completed..");
    }

 public void writeErrorMessage(){
 log.debug("MethodwriteErrorMessagestarted..");
 wsAbstime = LocalTime.now().toString() 
 wsAbstime = LocalTime.now().toString() <n1>  wsDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MMDDYYYY")) <n1>  wsTime = LocalTime.now().toString(); 
errorMsg.setEmDate(WsDate.substring(0,8));errorMsg.setEmTime(WsTime.substring(0,6));emVariable.setEmCusnum(dfhcommarea.getCaCustomerNum());emVariable.setEmResprc(WsResp.substring(0,5));emVariable.setEmResp2Rc(WsResp2.substring(0,5)); try { 
Mono<errorMsg> lgstsqResp = webclientBuilder.post().uri(lgstsq_URI).body(Mono.just(errorMsg,.class).retrieve().bodyToMono(.class).timeout(Duration.ofMillis(10_000));
 errorMsg = lgstsqresp.block(); 
}catch(Exception e){log.error(e)} 
if(eibcalen>0 )
 { 
 if(eibcalen<91 )
 { 
 caData = (dfhcommarea.caRequestId.substring(0,NaN))); try { 
Mono<caErrorMsg> lgstsqResp = webclientBuilder.post().uri(lgstsq_URI).body(Mono.just(caErrorMsg,.class).retrieve().bodyToMono(.class).timeout(Duration.ofMillis(10_000));
 caErrorMsg = lgstsqresp.block(); 
}catch(Exception e){log.error(e)} 

 } 
else { 
caData = (dfhcommarea.caRequestId + dfhcommarea.caReturnCode + dfhcommarea.caCustomerNum + dfhcommarea.caRequestSpecific.substring(0,72))); try { 
Mono<caErrorMsg> lgstsqResp = webclientBuilder.post().uri(lgstsq_URI).body(Mono.just(caErrorMsg,.class).retrieve().bodyToMono(.class).timeout(Duration.ofMillis(10_000));
 caErrorMsg = lgstsqresp.block(); 
}catch(Exception e){log.error(e)} 

}

 } 

log.debug("Method writeErrorMessage completed..");
 }

    /* End of program */
}<EOF>