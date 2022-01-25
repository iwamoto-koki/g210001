package jp.co.irs.incident_report_system.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import jp.co.irs.incident_report_system.Form.UserForm;




import jp.co.irs.incident_report_system.Entity.ir_mst_business_sp_entity;
import jp.co.irs.incident_report_system.Repository.ir_mst_business_sp_repository;


import java.util.List;

import javax.servlet.http.HttpSession; 



@Controller
public class LoginController {
	@Autowired
	ir_mst_business_sp_repository irRepo;
	
	//ログイン画面に遷移
	@RequestMapping(path = "/login", method = RequestMethod.GET)
		public String login() {
			return "login";
		}
	

	
	@RequestMapping(path = "/dologin",method = RequestMethod.POST)
	public String dologin(UserForm form,HttpSession session ) {

		//入力フォーム確認用
		System.out.println("入力されたユーザー名は＋"+form.getName());
		System.out.println("入力されたユーザーパスワードは＋"+form.getPass());

	///*	
		//ユーザーテーブルからユーザー情報をリストに入れる
		List<ir_mst_business_sp_entity>userList = irRepo.findByUserIdAndPassword(form.getName(), form.getPass());

		//一致したユーザーが存在するか？
		if(userList.size() == 1) {
			//情報が一致した場合
			//ユーザーオブジェクトに情報を入れる

			ir_mst_business_sp_entity user = userList.get(0);

			//ユーザー情報をセッションに入れる
			//session.setAttribute("user", user);
			
			//権限によって遷移先を変える
			String kengen = user.getAuthority();
			if(kengen == "" || kengen == null){
				System.out.println("権限が入っていない");
				return "redirect:/login";
			}
			int authority = Integer.parseInt(kengen);
			System.out.println(authority);
			if(authority == 0) {
				System.out.println("0ルート");
				return "dashBoard";
			}
			if(authority == 1) {
				System.out.println("1ルート");
				return "dashBoard";
			}
			else {
				System.out.println("例外ルート");
				return "redirect:/login";
			}	
		}
		else {
			//ユーザー情報が入っていなければログイン画面
			return "redirect:/login";
		}
	//	*/
		/*
		System.out.println("ここまできた");
		//リストの全検索で中身を確認するよう
		//List<ir_mst_business_sp_entity>userList = irRepo.findAll();
		List<Users>userList = userRepository.findAll();
		if(userList.size()>0){
			System.out.println(userList.size());
			for(int i = 0;i<userList.size();i++) {
				//System.out.println(userList.get(i).getUser_id());
				System.out.println(userList.get(i).getUserId());
				System.out.println(userList.get(i).getIsDelete());
				
			}
		}else{
			System.out.println("何も入っていない");
		}
		
		
		//Users user = new Users();
		
		//登録用処理
		/*
		user.setUserId("insert");
		user.setPassword("insert");
		userRepository.save(user);
		*/

		/*変更用処理
		user = userRepository.findByUserId("insert");
		user.setPassword("Change");
		userRepository.save(user);
		*/

		//削除用処理
		//userRepository.deleteById("test4");

		//return "dashBoard.html";

	}
	

}
