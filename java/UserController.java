package jp.co.internous.sirius.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.internous.sirius.model.domain.MstUser;
import jp.co.internous.sirius.model.form.UserForm;
import jp.co.internous.sirius.model.mapper.MstUserMapper;
import jp.co.internous.sirius.model.session.LoginSession;

/**
 * ユーザー登録処理をするコントローラー
 * @author KeitaFujimoto
 *
 */

@Controller
@RequestMapping("/sirius/user")
public class UserController {
	
	@Autowired
	private MstUserMapper userMapper;
	
	@Autowired
	private LoginSession loginSession;
		
	/**
	 * 新規ユーザー登録画面を初期表示
	 * @param m 画面表示用オブジェクト
	 * @return 新規ユーザー登録画面
	 */
	@RequestMapping("/")
	public String index(Model m) {
		m.addAttribute("loginSession",loginSession);
		return "register_user";
	}
	
	/**
	 * ユーザー名重複チェック
	 * @param f ユーザーフォーム
	 * @return trueの場合:登録成功、falseの場合:登録失敗
	 */
	@RequestMapping("/duplicatedUserName")
	@ResponseBody
	public boolean duplicatedUserName(@RequestBody UserForm f) {
		int count = userMapper.findCountByUserName(f.getUserName());
		return count > 0;
	}
	
	/**
	 * ユーザー情報登録
	 * @param UserForm ユーザーフォーム
	 * @return trueの場合:登録成功、falseの場合:登録失敗
	 */
	@RequestMapping("/register")
	@ResponseBody
	public boolean register(@RequestBody UserForm f) {
		MstUser user = new MstUser(f);
		int count = userMapper.insert(user);
		return count > 0;
	}
	
	
}
