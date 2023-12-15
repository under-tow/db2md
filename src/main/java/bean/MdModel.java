package bean;

import lombok.Data;

import java.util.List;

@Data
public class MdModel {

    private List<TableHeader> tiHeader;
    private List<TableHeader> tdHeader;

    private List<List<String>> tiContent;
    private List<List<String>> tdContent;


}
