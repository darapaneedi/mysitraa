package com.rubiklife.service;

import java.util.List;

import com.rubiklife.bo.MemberBO;
import com.rubiklife.entities.Member;
import com.rubiklife.entities.MemberHealtGoals;
import com.rubiklife.entities.MemberHealthStatistics;
import com.rubiklife.entities.MemberPointsStatistics;

public interface MemberFacade {

	
	MemberBO getMemberBO( Member member);
	
	List<MemberHealtGoals> getMemberGoals(Member member);
	
	List<MemberHealthStatistics> getMemberHealthStats( Member member);
	
	List<MemberPointsStatistics> getMemberPointsStats( Member member );
	
}
