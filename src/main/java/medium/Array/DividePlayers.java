package medium.Array;

public class DividePlayers {
    public long dividePlayers(int[] skill) {
        //Theres going to be 1000 skills
        int[] skillMap = new int[2001];

        int totalSkillCount = 0;
        for(int ski: skill){
            skillMap[ski]++;
            totalSkillCount += ski;
        }

        int halfSkill = skill.length/2;

        //Cant be divided equally
        if(totalSkillCount % halfSkill != 0){
            return -1;
        }

        int targetSkill = totalSkillCount/halfSkill;
        long totalSkillValue=0;

        for(int sk : skill){
            int partnerSkill = targetSkill - sk;

            //Cant form a skill Group. No partner skill
            if(skillMap[partnerSkill] == 0){
                return -1;
            }

            totalSkillValue += partnerSkill * sk;
            skillMap[partnerSkill]--;
        }

        return totalSkillValue;
    }
}
