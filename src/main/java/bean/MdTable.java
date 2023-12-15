package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public
class MdTable {
    private List<TableHeader> tiHeader;
    private List<List<String>> tiContent;
    private List<TableHeader> tdHeader;
    private List<List<String>> tdContent;

}