/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activityB.praktikum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ASUS
 */

@Controller

public class PraktikumController {
    
    @RequestMapping("/mytable")
    public String getTable(Model Data){
        
    ArrayList<List<String>> data = new ArrayList <>();
        
        data.add(Arrays.asList("ID","Nomor KTP","Nama","Alamat"));
        data.add(Arrays.asList("001","1111111111111111","novi","jl.sudirman"));
        data.add(Arrays.asList("002","1111111111111112","rama","jl.supratman"));
        data.add(Arrays.asList("003","1111111111111113","dina","jl.Hartono"));
        data.add(Arrays.asList("004","1111111111111114","rudi","jl.Gangkecil"));
        data.add(Arrays.asList("005","1111111111111115","erik","jl.cendrawasih"));
        data.add(Arrays.asList("006","1111111111111116","rafi","jl.kenangan"));
        data.add(Arrays.asList("007","1111111111111117","brodi","jl.Batam"));
        data.add(Arrays.asList("008","1111111111111118","nopal","jl.bekasi"));
        data.add(Arrays.asList("009","1111111111111119","abid","jl.bogor"));
        data.add(Arrays.asList("010","1111111111111110","iman","jl.sulaiman"));
        data.add(Arrays.asList("011","1111111111111111","resa","jl.imambonjol"));
        data.add(Arrays.asList("012","1111111111111112","paldi","jl.broder"));
        data.add(Arrays.asList("013","1111111111111113","rosi","jl.dago"));
        data.add(Arrays.asList("014","1111111111111114","deri","jl.kemang"));
        data.add(Arrays.asList("015","1111111111111115","ijol","jl.taruna"));
        data.add(Arrays.asList("016","1111111111111116","reza","jl.ibrahim"));
        data.add(Arrays.asList("017","1111111111111117","dedi","jl.kesusahan"));
        data.add(Arrays.asList("018","1111111111111118","robi","jl.kondusif"));
        data.add(Arrays.asList("019","1111111111111119","dendi","jl.kerinduan"));
        data.add(Arrays.asList("020","1111111111111120","dodi","jl.telanai"));
        
        Data.addAttribute("table", data);
        
        
        return "tableViewer";
    }
    
}
