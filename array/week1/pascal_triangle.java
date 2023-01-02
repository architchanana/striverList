package com.company.striver_sheet.array.week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pascal_triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>v=new ArrayList<>(Collections.nCopies(i+1, 1));
            for(int j=1;j<i;j++){
                v.set(j,ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
            }
            ans.add(v);
        }
        return ans;

    }
}
