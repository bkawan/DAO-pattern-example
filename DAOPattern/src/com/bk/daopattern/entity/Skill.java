/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bk.daopattern.entity;

/**
 *
 * @author bkawan
 * @date Feb 25, 2016
 * @time 1:41:43 PM
 */
public class Skill {
    
    private int skillId;
    private String skillName, skillType, skillDesc;

    public Skill() {
    }

    public Skill(int skillId, String skillName, String skilType, String skillDesc) {
        this.skillId = skillId;
        this.skillName = skillName;
        this.skillType = skilType;
        this.skillDesc = skillDesc;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    public String getSkillDesc() {
        return skillDesc;
    }

    public void setSkillDesc(String skillDesc) {
        this.skillDesc = skillDesc;
    }

    @Override
    public String toString() {
        return "Skill{" + "skillId=" + skillId + ", skillName=" + skillName + ", skillType=" + skillType + ", skillDesc=" + skillDesc + '}';
    }
    
    
    

}
