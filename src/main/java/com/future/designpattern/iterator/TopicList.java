package com.future.designpattern.iterator;

/**
 * @author juan.tjandra
 */
public class TopicList implements NewList<Topic> {
  private Topic[] topics;

  public TopicList (Topic[] topics) {
    this.topics = topics;
  }

  @Override
  public NewIterator<Topic> iterator() {
    return new TopicIterator(topics);
  }
}
