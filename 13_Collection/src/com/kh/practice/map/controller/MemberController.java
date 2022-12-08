package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap();
	
	public boolean joinMembership(String id, Member m) {
		// 전달 받은 id가 없다면 id와 m을 map에 추가 후 true 반환
		// 있다면 false 값 반환
		if(map.get(id) == null) {
			map.put(id, m);
			return true;
		}else {
			return false;
		}
	}
	
	public String logIn(String id, String password) {
		// 전달 받은 id가 존재하는지 확인 후 존재하면 Member에 저장된 비밀번호와
		// 사용자가 입력한 비밀번호가 같은지 비교.
		// 같다면 저장된 Member의 이름 반환, 그 외 모든 상황에는 null 반환
		String name = null;
		if(map.get(id) != null && map.get(id).getPassword().equals(password)) {
			name = map.get(id).getName();
		}
		return name;	
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.get(id) != null && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			return true;
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}
	
	public TreeMap sameName(String name) {
		Set<String> set = map.keySet();
		TreeMap<String, String> tm = new TreeMap();
		
		for(String key : set) {
			if(map.get(key).getName().equals(name)) {
				tm.put(key,name);
			}
		}
		return tm;
	}
}
