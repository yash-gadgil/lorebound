package com.jackydoge.lorebound.quest.engine.graph.node.type;

import com.jackydoge.lorebound.quest.engine.graph.node.QuestNode;
import com.jackydoge.lorebound.quest.engine.graph.node.QuestNodeId;
import com.jackydoge.lorebound.quest.engine.reward.Reward;

import java.util.Set;

public class ItemRelatedQuestNode extends QuestNode {


    public ItemRelatedQuestNode(Set<QuestNodeId> prereq, Set<QuestNodeId> next, Set<Reward> rewards, int difficulty) {
        super(prereq, next, rewards, difficulty);
    }
}
