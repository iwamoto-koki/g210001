package jp.co.irs.incident_report_system.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;

import jp.co.irs.incident_report_system.Form.UserForm;

import jp.co.irs.incident_report_system.Entity.ir_mst_business_sp_entity;
import jp.co.irs.incident_report_system.Repository.ir_mst_business_sp_repository;


@Controller
public class specialistController {
    @Autowired
        ir_mst_business_sp_repository irRepo;

    //マスタ画面遷移GET
    @RequestMapping(path = "/insert", method = RequestMethod.GET)
    public String insert(){
        return"specialistMaster";
    }

    //マスタ画面遷移POST
   @RequestMapping(path = "/doview",method = RequestMethod.POST)
   public String doview(Model model,RedirectAttributes redirectAttributes){
       List<ir_mst_business_sp_entity>userList =irRepo.findAll();
       if(userList.size()>=1){
           model.addAttribute("users", userList);
           System.out.println("ユーザーの件数は"+userList.size());
           return "specialistMaster";
       }else{
           redirectAttributes.addFlashAttribute("error", "エラーメッセージ内容");
        return "redirect:/insert";
       }

       
   }

}
