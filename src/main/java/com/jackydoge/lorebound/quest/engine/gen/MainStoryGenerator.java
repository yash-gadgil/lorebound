package com.jackydoge.lorebound.quest.engine.gen;

import com.jackydoge.lorebound.quest.engine.graph.QuestTree;
import com.jackydoge.lorebound.quest.engine.graph.node.type.ExplorationQuestNode;

import java.util.HashSet;

public class MainStoryGenerator {



    public static QuestTree generate() {

        QuestTree mainStoryTree = new QuestTree("main_story",
                new HashSet<>());

        mainStoryTree.addNode(new ExplorationQuestNode(
                new HashSet<>(),
                new HashSet<>(),
                new HashSet<>(),
                3));

        return mainStoryTree;
    }

}
