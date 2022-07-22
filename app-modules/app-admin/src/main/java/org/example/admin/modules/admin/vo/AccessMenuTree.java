package org.example.admin.modules.admin.vo;

import org.example.common.vo.TreeNode;

import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
/**
 * ${DESCRIPTION}
 *
 * @author the sun
 * @create 2017-06-19 13:03
 */
@Data
public class AccessMenuTree extends TreeNode implements Serializable{
    String title;
    String icon;
    String path;
    List<AccessMenuTree> nodes = new ArrayList<AccessMenuTree>();


    @Override
    public void setChildren(List<TreeNode> children) {
        super.setChildren(children);
        nodes = new ArrayList<AccessMenuTree>();
    }

    @Override
    public void add(TreeNode node) {
        super.add(node);
        AccessMenuTree n = new AccessMenuTree();
        BeanUtils.copyProperties(node,n);
        nodes.add(n);
    }
}
