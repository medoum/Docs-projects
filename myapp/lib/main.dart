import 'package:flutter/material.dart';

void main() => runApp(MaterialApp(
  home: Scaffold(
    appBar: AppBar(
      title: Text('Bonjour'),
      centerTitle: true ,
      backgroundColor: Colors.red,

    ),
    body: Center(
      child: Text(
        'Hello Med',
         style: TextStyle(
           fontSize: 20.0,
          fontWeight: FontWeight.bold,
           letterSpacing: 2.0,
           color: Colors.grey[600],
           fontFamily: 'IndieFlower',
         ),
      ),
    ) ,
    floatingActionButton: FloatingActionButton(onPressed: (){},
      child: Text('click'),
      backgroundColor: Colors.red[600],

    ) ,
  ),

));


