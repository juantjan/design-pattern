package com.future.designpattern.iterator;

/**
 * @author juan.tjandra
 */
public class TopicIterator implements NewIterator<Topic> {
  private int position;
  private Topic[] topics;

  public TopicIterator(Topic[] topics) {
    this.topics = topics;
  }

  @Override
  public void reset() {
    position = 0;
  }

  @Override
  public Topic next() {
    return topics[position++];
  }

  @Override
  public Topic currentItem() {
    return topics[position];
  }

  @Override
  public boolean hasNext() {
    return position < topics.length;
  }
}
