package com.jackydoge.lorebound.quest.engine.graph;

import com.jackydoge.lorebound.quest.engine.entry.QuestEntryPoint;
import com.jackydoge.lorebound.quest.engine.graph.node.QuestNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class QuestTree {
    final String id;
    Map<Integer, QuestNode> nodes;
    Set<QuestEntryPoint> questEntryPoints;
    int nodeCounter = 0;

    public QuestTree(String id, Set<QuestEntryPoint> questEntryPoints) {
        this.id = id;
        this.nodes = new HashMap<>();
        this.questEntryPoints = questEntryPoints;
    }

    public void addNode(QuestNode node) {
        nodes.put(nodeCounter++, node);
    }



}
