package org.eclipse.xtend.core.tests.smoke;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class Case_0 {
  private final int id;
  
  public String foo(final String a, final String b) {
    String _xblockexpression = null;
    {
      ArrayList<String> list = CollectionLiterals.<String>newArrayList();
      int _size = list.size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for (final Integer i : _upTo) {
        String _string = i.toString();
        String _plus = (_string + " ");
        String _get = list.get((i).intValue());
        String _plus_1 = (_plus + _get);
        InputOutput.<String>println(_plus_1);
      }
      final ArrayList<String> strings = null;
      final Set<List<String>> x1 = CollectionLiterals.<List<String>>newHashSet(strings);
      String _xifexpression = null;
      boolean _isUpper = this.isUpper(a);
      if (_isUpper) {
        _xifexpression = this.another(a, (b + "holla"));
      } else {
        String _xblockexpression_1 = null;
        {
          String x = a;
          char[] _charArray = b.toCharArray();
          for (final char y : _charArray) {
            x = (x + Character.valueOf(y));
          }
          _xblockexpression_1 = x;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public void accept(final Set<String> set) {
  }
  
  public boolean isUpper(final String s) {
    String _upperCase = s.toUpperCase();
    return Objects.equal(_upperCase, s);
  }
  
  public String another(final String x, final String y) {
    return (y + x);
  }
  
  public Case_0(final int id) {
    super();
    this.id = id;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + this.id;
    return result;
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Case_0 other = (Case_0) obj;
    if (other.id != this.id)
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("id", this.id);
    return b.toString();
  }
  
  @Pure
  public int getId() {
    return this.id;
  }
}
