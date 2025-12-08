package com.jackydoge.lorebound.quest.engine.graph.node;

import com.jackydoge.lorebound.quest.engine.reward.Reward;

import java.util.Set;

public abstract class QuestNode {

    QuestNodeState questNodeState;

    final QuestNodeId id;

    final Set<QuestNodeId> prereq;
    final Set<QuestNodeId> next;

    final Set<Reward> rewards;
    final int difficulty;

    public QuestNode(String graphId, int localId, Set<QuestNodeId> prereq, Set<QuestNodeId> next, Set<Reward> rewards, int difficulty) {
        this.prereq = prereq;
        this.next = next;
        this.rewards = rewards;
        this.difficulty = difficulty;
        this.id = new QuestNodeId(graphId, localId);
        this.questNodeState = QuestNodeState.LOCKED;
    }
}
