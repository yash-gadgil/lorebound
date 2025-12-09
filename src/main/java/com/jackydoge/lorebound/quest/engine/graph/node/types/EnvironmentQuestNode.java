package com.jackydoge.lorebound.quest.engine.graph.node.types;

import com.jackydoge.lorebound.quest.engine.graph.node.QuestNode;
import com.jackydoge.lorebound.quest.engine.graph.node.QuestNodeId;
import com.jackydoge.lorebound.quest.engine.reward.Reward;

import java.util.Set;

public class EnvironmentQuestNode extends QuestNode {

    public EnvironmentQuestNode(String graphId, int localId, Set<QuestNodeId> prereq, Set<QuestNodeId> next, Set<Reward> rewards, int difficulty) {
        super(graphId, localId, prereq, next, rewards, difficulty);
    }


}
